import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';
import 'material-grid/dist/css/material-grid.css';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom'
import ShoppingCart from "./components/shopping-cart"

const routing = (
    <Router>
        <div>

            <Switch>
                <Route path="/" component={App}/>
                <Route path="/shoppingCart" component={ShoppingCart}/>
            </Switch>
        </div>
    </Router>
);

ReactDOM.render(routing, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
