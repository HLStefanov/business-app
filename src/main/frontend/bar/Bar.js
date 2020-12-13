import React from 'react'
import './Bar.css'
import 'react-router-dom'
import {Link} from "react-router-dom";

export default class Bar extends React.Component{
    render() {
        return(
            <div>
                <ul className='list'>
                    <li className='element'><Link className='link' to={'./Home'}>Home</Link></li>
                    <li className='element'><Link className='link' to={'./Products'}>Products</Link></li>
                    <li className='element'><Link className='link' to={'../login/Login'}>Login</Link></li>
                    <li className='element'><Link className='link' to={'./Logger'}>Register</Link></li>
                </ul>
            </div>
        );
    }
}

