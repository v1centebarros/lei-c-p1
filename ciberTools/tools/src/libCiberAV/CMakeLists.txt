
set(target CiberAV)

set(CiberAV_SRC
    #Source
    CiberAV.cpp
)

add_library(${target} SHARED ${CiberAV_SRC})

target_include_directories(${target} PUBLIC ${CMAKE_CURRENT_SOURCE_DIR})
target_include_directories(${target} PUBLIC ${CMAKE_CURRENT_SOURCE_DIR}/../libRobSock)
#target_compile_definitions(${target} PRIVATE -DCIBERQTAPP)
#target_link_libraries(${target} Qt5::Widgets Qt5::Xml)

#set_target_properties(RobSock PROPERTIES CMAKE_RUNTIME_OUTPUT_DIRECTORY "${CMAKE_CURRENT_SOURCE_DIR}")
