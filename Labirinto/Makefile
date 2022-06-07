.PHONY: all clean cleanall #install

GRAMMAR=Lab.g4
TARGETS_CPP=LabLexer.cpp LabParser.cpp LabBaseVisitor.cpp LabVisitor.cpp Execute.cpp
OBJS=$(TARGETS_CPP:cpp=o) LabMain.o
TARGET=LabMain

CFLAGS=-Wall -ggdb -pthread -std=gnu++17 -I/usr/local/include/antlr4-runtime
LDFLAGS=-lantlr4-runtime

all: $(TARGET)

$(TARGETS_CPP): $(GRAMMAR)
	antlr4 -cpp -visitor $(GRAMMAR)

%.o: %.cpp
	g++ $(CFLAGS) -c $<

$(TARGET): $(GRAMMAR) $(TARGETS_CPP) $(OBJS)
	g++ $(CFLAGS) $(OBJS) $(LDFLAGS) -o $(TARGET)

#install: $(TARGET)
#	cp -a $(TARGET) ../../bin

clean:
	rm -fv $(OBJS) core

cleanall: clean
	antlr4-clean -cpp
	rm -fv $(TARGET)
