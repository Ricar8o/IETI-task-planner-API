
# Container Links

[![DeployAzureContainer](https://www.docker.com/sites/default/files/d8/2019-07/Moby-logo.png)](http://ieti-task-api-v1.eastus.azurecontainer.io:8080)

**Docker Hub**

    ricar8o/ieti-task-app-backend

## API 

**GET** 

    - /users
    - /users/{id} 

**POST**

    - /users             # Post a user
    - /users/{id}        # Update user info

**DELETE**

    - /users/{id}



Example post request body

    {
        "id": "2",
        "password": "1234567",
        "fullname": "Andres Ricardo Martinez",
        "email": "ricardo@somemail.com"
    }


If you have Postman, you can import a collection of the API from this [file](task-api-users.postman_collection.json).