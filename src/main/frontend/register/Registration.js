import React from 'react'
import ReactDOM from 'react-dom'
import './Registration.css'
class Logger extends React.Component{
    constructor() {
        super();
        this.state ={
            username : '',
            mail : '',
            pass : '',
            repPass : ''
        }
        this.morphState = this.morphState.bind(this);
        this.validateUserInput = this.validateUserInput.bind(this);
        this.conditionalMessage = this.conditionalMessage.bind(this)
    }
    morphState(event) {
        let {name,value} = event.target;
        this.setState({[name] : value});
    }



    validateUserInput(event){
        let {value} = event.target
        console.log(value)
        if (value === '' ) return false
        const expr = RegExp('/^(?:[A-Za-z]+|)$/')
        return expr.test(value)
    }

    conditionalMessage(){
        return this.validateUserInput ?
            <span  style={{color : 'red'}}>Please enter only numbers and letters</span>
            : null
    }



    render() {
        console.log(this.state)
        return <FormComponent
            data = {this.state}
            morphState = {this.morphState}
            validateUserInput = {this.validateUserInput}
            conditionalMessage = {this.conditionalMessage}
        />
    }
}



function FormComponent(props){
    return(<main className='container'>
        <form className='sub-container'>
            <div className='title'>Registration</div>
            <label>
                Username<br/>
                <input onChange={props.morphState}
                       className='input'
                       type = 'text'
                       value={props.data.username}
                       placeholder='st1555'
                       name = 'username'
                /><br/>
            </label>
            <label>
                <br/> Email <br/>
                <input onChange={props.morphState}
                       className='input'
                       type = 'text'
                       value={props.data.mail}
                       placeholder='mail123@gmail.com'
                       name = 'mail'
                /><br/>
            </label>
            <label>
                <br/> Password <br/>
                <input onChange={props.morphState}
                       className='input'
                       type = 'password'
                       value={props.data.pass}
                       name = 'pass'
                /><br/>
            </label>
            <label>
                <br/> Repeat password <br/>
                <input onChange={props.morphState}
                       className='input'
                       type = 'password'
                       value={props.data.repPass}
                       name = 'repPass'
                /><br/>
            </label>
            {/*{props.validateUserInput ?
                         <span  style={{color : 'red'}}>Please enter only numbers and letters</span>
                          : console.log('input invalid')}*/}

            <button onClick={props.conditionalMessage}
                    className='btn' >Register now</button>

        </form>
    </main>)
}


ReactDOM.render(<Logger/>,document.getElementById('react-mountpoint'))

export default Logger;
