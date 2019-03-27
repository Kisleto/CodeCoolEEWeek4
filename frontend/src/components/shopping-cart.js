import React, {Component} from 'react';
import axios from "axios";

class ShoppingCart extends Component {

    constructor(props) {
        super(props);
        this.state = {}
    }

    componentWillReceiveProps(props) {
        let shitWishAPIUrl = `http://localhost:8091/products`;
        axios.get(shitWishAPIUrl)
            .then(res => {
                const items = res.data;
                this.setState({items});

            })
    }

}