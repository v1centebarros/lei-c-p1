
set(GUISample_SRC
    #Source
    main.cpp
    lmap.cpp
    robview.cpp
    sampapp.cpp
)

set(target qtClient)

add_executable(${target} ${GUISample_SRC})

target_include_directories(${target} PRIVATE ${CMAKE_CURRENT_SOURCE_DIR})
target_compile_definitions(${target} PRIVATE -DCIBERQTAPP)
target_link_libraries(${target} Qt5::Widgets Qt5::Xml RobSock)

#set_target_properties(GUISample PROPERTIES RUNTIME_OUTPUT_DIRECTORY "${CMAKE_CURRENT_SOURCE_DIR}")
