import React, {Component} from 'react';
import axios from "axios";
import {Button} from "react-bootstrap"
import "./css/shoppingcart.css"

class ShoppingCart extends Component {

    constructor(props) {
        super(props);
        this.state = {
            items: [],
            shop: ""
        }
    }

    componentDidMount() {
        let shoppingCarAPIUrl = `http://localhost:60001/cart`;
        axios.get(shoppingCarAPIUrl)
            .then(res => {
                const items = res.data;
                this.setState({items});

            })
    }

    onClick() {
        this.setState({shop: "re"})
    }

    render() {
        if (this.state.items !== null) {
            return (
                <div className="wrapper">
                    {this.state.items.map(item => <div className="item">
                            <div className="centered">
                                <Button className="minus" variant={"primary"}> - </Button>
                        <p>{item.name}</p>
                                <img src={item.url}/>
                        <p>{item.price}</p>
                                <Button variant={"primary"} className="plus"> + </Button></div>
                        </div>
                    )
                    }
                </div>
            )
        } else {
            return (
                <div>
                    <p>No items in the cart yet</p>
                </div>
            )
        }
    }
}

export default ShoppingCart;