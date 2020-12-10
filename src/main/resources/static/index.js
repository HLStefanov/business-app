import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import Logger from '../../frontend/register/Registration';
import Bar from '../../frontend/bar/Bar'

import {BrowserRouter} from "react-router-dom";


ReactDOM.render(
    <BrowserRouter>
        <Bar/>
        <Logger />
    </BrowserRouter>,
    document.getElementById('react-mountpoint')
);
