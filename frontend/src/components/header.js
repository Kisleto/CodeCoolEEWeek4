import React, {Component} from 'react';
import './css/header.css'

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
            </div>
        )
    }
}

export default Header;