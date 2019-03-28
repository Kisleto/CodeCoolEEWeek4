import React, {Component} from 'react';
import axios from "axios";
import {Button} from "react-bootstrap"
import "./css/shoppingcart.css"
import Grid from 'material-grid/dist/Grid/Grid';


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
                <div>
                    <Grid>
                        {this.state.items.map(item =>
                            <div className="card">


                                <img className="card-img-top" src={item.url}/>
                                <Button className="minus" variant={"primary"}> - </Button>
                                <div className="card-body">
                                    <p className="card-text">{item.price}</p>
                                </div>
                                <p className="card-text">{item.name}</p>
                                <Button variant={"primary"} className="plus"> + </Button>
                            </div>
                    )
                    }
                    </Grid>

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