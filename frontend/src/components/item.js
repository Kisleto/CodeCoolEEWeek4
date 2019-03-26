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
        this.state.items.forEach(item => {
            return (
            <div>
                <div>{item.name}</div>

            </div>
            )
        })

    }

}