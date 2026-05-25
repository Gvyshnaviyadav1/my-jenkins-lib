def call() {
    sh """
        echo "Building images..."
        
        docker build -t todo-frontend ./todo-frontend
        docker build -t todo-backend ./todo_project
    """
}