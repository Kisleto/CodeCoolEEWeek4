import React, {Component} from 'react';
import axios from 'axios';


class Item extends Component {
    constructor(props) {
        super(props);
        this.state = {
            items: []
        }
    }

    componentDidMount(event) {
        let shitWishAPIUrl = `http://localhost:8091/products/all`;
        event.preventDefault();
        axios.get(shitWishAPIUrl)
            .then(res => {
                const items = res.data;
                this.setState({items});

            });
    }


    render() {

            return (
            <div>
                <div>{this.state.items.map((item, i) => <p className="name" key={i}>{item.name}</p> )}</div>
                <div>{this.state.items.map((item, i) => <p className="price" key={i}>{item.price}</p> )}</div>

            </div>
            )

    }

}