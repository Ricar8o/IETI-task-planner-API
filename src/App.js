import React, { Component } from 'react';
import { UserList } from './components/UserList';

class App extends Component {

  constructor(props) {
      super(props);
      this.state = {
          userList: [],
      };
  }

  componentDidMount() {
    fetch('http://ieti-task-api-v1.eastus.azurecontainer.io:8080/users')
        .then(response => response.json())
        .then(data => {
            let userList = [];
            data.forEach(function (user) {
                userList.push(
                   user
                )

            });
            this.setState({userList: userList});
        });
  }

  render() {
      return (
          <div>
              {/* <!-- Implement a React compontent to render the list --> */}
              {/* <UserList usersList={this.state.usersList}/> */}
              <UserList userList={this.state.userList}/>
              
          </div>
      );
  }
}

export default App;