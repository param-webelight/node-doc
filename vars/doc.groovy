def call() {
 sh  "docker build -t run-dof ."
 sh  "docker run -dp 3000:3000 run-dof"
}
