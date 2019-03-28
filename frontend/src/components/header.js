import React, {Component} from 'react';
import './css/header.css'


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
                    <div className="cart">
                    </div>
                    <h1 className="title"> ShitWish </h1>
                </div>

            </div>
        )
    }
}

export default Header;