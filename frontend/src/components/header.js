import React, {Component} from 'react';
import './css/header.css'
import {BrowserRouter as Router, Link} from "react-router-dom";


class Header extends Component {

    constructor(props) {
        super(props);
        this.state = {
            which: "",
            where: ""
        }
    }

    componentDidMount() {
        if (this.props.which === "shoppingCart") {
            this.setState({which: "Back"})
            this.setState({where: "/"})
        } else {
            this.setState({which: "Cart"})
            this.setState({where: "/shoppingCart"})

        }
    }

    render() {
        return (
            <div className="contain">
                <div>
                    <h1 className="title"> ShitWish </h1>
                </div>
                <div className="cart">
                    <Router>
                        <li>
                            <Link to={this.state.where}> {this.state.which}</Link>
                        </li>
                    </Router>
                </div>

            </div>
        )
    }
}

export default Header;