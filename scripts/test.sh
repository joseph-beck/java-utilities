main() {
    ant
    read args
    java -cp bin: Main $args
}

time main