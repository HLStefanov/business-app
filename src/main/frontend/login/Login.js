import React from 'react'
import ReactDOM from 'react-dom'
import './Login.css'


class Login extends React.Component{
    constructor() {
        super();
    }

    render() {
        return <LoginForm/>
    }
}

function LoginForm(){

    return <main className='container'>
        <div className='title'>Login</div>
        <form className='sub-container'>
            <input
                className='input'
                type = 'text'
                placeholder='user123'
            /><br/>
            <input
                className='input'
                type = 'password'
                placeholder='········'
            /><br/>
        </form>
        <button className='btn'>Log in</button>
    </main>
}

ReactDOM.render(<Login/>,document.getElementById('root'))

export default Login;