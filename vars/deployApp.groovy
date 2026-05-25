def call(String stackName) {
    sh """
        echo "Deploying ${stackName}..."
        
        docker stack deploy \
            -c docker-compose.yml \
            ${stackName}
            
        echo "Verifying deployment..."
        docker stack ps ${stackName}
    """
}