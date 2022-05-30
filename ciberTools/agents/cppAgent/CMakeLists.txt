set(targets
    ag1
)

foreach (target ${targets})
    add_executable(${target} ${target}.cpp)
    target_link_libraries(${target} RobSock)
endforeach()
