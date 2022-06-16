#include "CiberAV.h"
#include "RobSock.h"
#include <unistd.h>
#include <sys/wait.h>
#include <sys/types.h>
#include <stdlib.h>
#include <stdio.h>
#include <iostream>
#include <vector>
#include <math.h>
using namespace std;


class Point {
  public:
    int x;
    int y;

    // Constructor
    Point(int x, int y) {
      this->x = x;
      this->y = y;
    }

    // Distance point/pose
    float distance(float x, float y) {
      return sqrt(pow(x - this->x, 2) + pow(y - this->y, 2));
    }

    // overload the * operator to multiply a point by a scalar
    Point operator*(float scalar) {
      return Point(this->x * scalar, this->y * scalar);
    }

    // Overload the + operator
    Point operator+(const Point& p) {
      return Point(this->x + p.x, this->y + p.y);
    }

    // Overload the - operator
    Point operator-(const Point& p) {
      return Point(this->x - p.x, this->y - p.y);
    }

    // overload the << operator
    friend ostream& operator<<(ostream& os, const Point& p) {
      os << "(" << p.x << ", " << p.y << ")";
      return os;
    }

};

class Twist{
  public:
    int linear;
    int angular;

    // Constructor
    Twist(int linear, int angular) {
      this->linear = linear;
      this->angular = angular;
    }

    // overload the * operator to multiply a point by a scalar
    Twist operator*(float scalar) {
      return Twist(this->linear * scalar, this->angular * scalar);
    }

    // overload the + operator
    Twist operator+(const Twist& t) {
      return Twist(this->linear + t.linear, this->angular + t.angular);
    }

    // overload the - operator
    Twist operator-(const Twist& t) {
      return Twist(this->linear - t.linear, this->angular - t.angular);
    }

    // overload the << operator
    friend ostream& operator<<(ostream& os, const Twist& t) {
      os << "(" << t.linear << ", " << t.angular << ")";
      return os;
    }

};

class Pose{
  public:
    int x;
    int y;
    int angle;

    Pose (int x, int y, int angle) {
      this->x = x;
      this->y = y;
      angle = angle % 360;
      if(angle >180){
        this->angle= 360 - angle;
      }
      else if (angle < -180){
        this->angle = 360 + angle;
      }
      else{
        this->angle = angle;
      }
    }

    // Distance point/pose
    float distance(float x, float y) {
      return sqrt(pow(x - this->x, 2) + pow(y - this->y, 2));
    }
    // angle between pose and point in degrees
    float angleTo(float x, float y) {
      return atan2(y - this->y, x - this->x) * 180 / M_PI - this->angle;
    }

    // overload the + operator
    Pose operator+(const Pose& t) {
      return Pose(this->x + t.x, this->y + t.y, this->angle + t.y);
    }

    // overload the - operator
    Pose operator-(const Pose& t) {
      return Pose(this->x - t.x, this->y - t.y, this->angle - t.y);
    }

    // overload the << operator
    friend ostream& operator<<(ostream& os, const Pose& p) {
      os << "(" << p.x << ", " << p.y << ", " << p.angle << ")";
      return os;
    }
};



std::vector<float> concat_num (std::vector<float> v1, std::vector<float> v2) {
    for (unsigned long int i=0; i<v2.size(); i++) {
        v1.push_back(v2.at(i));
    }
    return v1;
}

std::vector<string> concat_text (std::vector<string> v1, std::vector<string> v2) {
    for (unsigned long int i=0; i<v2.size(); i++) {
        v1.push_back(v2.at(i));
    }
    return v1;
}


std::vector<bool> concat_bool (std::vector<bool> v1, std::vector<bool> v2) {
    for (unsigned long int i=0; i<v2.size(); i++) {
        v1.push_back(v2.at(i));
    }
    return v1;
}


std::vector<Point> concat_tuple (std::vector<Point> v1, std::vector<Point> v2) {
    for (unsigned long int i=0; i<v2.size(); i++) {
        v1.push_back(v2.at(i));
    }
    return v1;
}

std::vector<Twist> concat_tuple (std::vector<Twist> v1, std::vector<Twist> v2) {
    for (unsigned long int i=0; i<v2.size(); i++) {
        v1.push_back(v2.at(i));
    }
    return v1;
}

std::vector<Pose> concat_tuple (std::vector<Pose> v1, std::vector<Pose> v2) {
    for (unsigned long int i=0; i<v2.size(); i++) {
        v1.push_back(v2.at(i));
    }
    return v1;
}




void robot_process_nody(){
    init("Nody", 1);
    cout << ("Going to beacon 1\n");
    float var_farol = 1;
    cout << ("..Rotating to beacon\n");
    while (!(beaconAngle(var_farol) > -10 && beaconAngle(var_farol) < 10)) {
        motors(80, -80);
        apply();

    }
    while (groundType() != var_farol) {
        float var_linearPower = 80.0;
        float var_angularPower = 1 * beaconAngle(var_farol);
        motors(var_linearPower - var_angularPower, var_linearPower + var_angularPower);
        apply();

    }
    motors(0, 0);
    apply();
    pickUp();
    returning();
    while (!(startAngle() > -10 && startAngle() < 10)) {
        motors(80, -80);
        apply();

    }
    while (startDistance() > 2) {
        float var_linearPower = 80.0;
        float var_angularPower = 1 * startAngle();
        motors(var_linearPower - var_angularPower, var_linearPower + var_angularPower);
        apply();

    }
    motors(0, 0);
    apply();
    finish();
    cout << ("Bye!\n");

}




int main() {
    pid_t pid0 = fork();
    if (pid0 == 0)
    {
        robot_process_nody();
    }


    while(wait(NULL) > 0);
    //end of main function

    return 0;
}