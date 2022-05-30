
set(robsample_SRC
    #Source
    mainRob.c
    robfunc.c
)

add_executable(cClient ${robsample_SRC})

#target_include_directories(cClient PRIVATE ${CMAKE_CURRENT_SOURCE_DIR})
target_link_libraries(cClient RobSock)

#set_target_properties(robsample PROPERTIES RUNTIME_OUTPUT_DIRECTORY "${CMAKE_CURRENT_SOURCE_DIR}")
