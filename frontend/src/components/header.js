import React, {Component} from 'react';
import './css/header.css'
import ShoppingCart from './shopping-cart'

class Header extends Component {

    constructor(props) {
        super(props);
        this.state = {}
    }


    render() {
        return (
            <div className="contain">
                <div>
                    <h1 className="title"> ShitWish </h1>
                </div>
                <ShoppingCart/>
            </div>
        )
    }
}

export default Header;