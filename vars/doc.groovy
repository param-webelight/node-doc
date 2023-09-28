def call() {
 sh "docker build -t tes ."
 sh "docker run -dp 3000:3000 tes"
}
