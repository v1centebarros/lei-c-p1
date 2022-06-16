
foreach (target a1 a3 a4 myAgent)
    add_executable(${target} ${target}.cpp)
    #target_include_directories(${target} PRIVATE ${CMAKE_CURRENT_SOURCE_DIR})
    target_link_libraries(${target} CiberAV RobSock)
endforeach()
