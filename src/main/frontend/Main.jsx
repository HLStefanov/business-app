import React, { Component } from "react";
import ReactDOM from 'react-dom';
import './App.css';

/*class Main extends Component {
    render() {
        return (
            <div>
                <h1>Demo Component</h1>
                <img src="https://upload.wikimedia.org/wikipedia/commons/a/a7/React-icon.svg"/>
            </div>
        );
    }
}*/

/*import React from 'react';
import './App.css';*/

function App(){

    var width = window.innerWidth;

    return(
        <div className="log">
            <form>
                <label>Login to your catalogue:</label>
                <NameField/>
                <PassField/>
                <br/>
                <button className="submit">Submit</button>
            </form>
        </div>
    );
}
function NameField(){
    return(
        <div>
            <br/>
            <label>Username</label>
            <br/>
            <input type = "text" id="name"></input>
            <br/>
        </div>

    );
}
function PassField(){
    return(
        <div>
            <br/>
            <label>Password</label>
            <br/>
            <input type = "text" id = "password"></input>
            <br/>
        </div>

    );
}

ReactDOM.render(
    <App />,
    document.getElementById('react-mountpoint')
);
