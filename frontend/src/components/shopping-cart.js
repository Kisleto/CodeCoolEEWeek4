import React, {Component} from 'react';
import axios from "axios";
import {Button} from "react-bootstrap"

class ShoppingCart extends Component {

    constructor(props) {
        super(props);
        this.state = {
            items: []
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

    render() {
        if (this.state.items !== null) {
            return (
                <div>
                    {this.state.items.map(item => <div className="item"><Button variant={"primary"}> - </Button>
                        <p>{item.name}</p>
                        <p>{item.imgURL}</p>
                        <p>{item.price}</p>
                        <Button variant={"primary"}> - </Button></div>)

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