import React, {Component} from 'react';
import axios from "axios";
import "./css/shoppingcart.css"
import Grid from 'material-grid/dist/Grid/Grid';
import CartItem from './shoppingCartItem'

class ShoppingCart extends Component {

    constructor(props) {
        super(props);
        this.state = {
            items: [],
            shop: "",
            quantity: 1
        };

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

        return (
            <div>
                <Grid>
                    {this.state.items.map((item) => <CartItem id={item.id} name={item.name} price={item.price}
                                                              imgURL={item.url} quantity={item.quantity}/>)}
                </Grid>
            </div>
        )
    }
}

export default ShoppingCart;