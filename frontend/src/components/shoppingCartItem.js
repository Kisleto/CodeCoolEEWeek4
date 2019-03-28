import {Button} from "react-bootstrap";
import React, {Component} from "react";
import "./css/shoppingcart.css"
import axios from 'axios';


class shoppingCartItem extends Component {
    state = {
        quantity: 1
    };


    componentDidMount() {
        this.setState({quantity: this.props.quantity})
    }

    handleDeleteClick() {
        const data = {'data': this.props.id};
        const header = {
            'CORS': 'Access-Control-Allow-Origin: *'
        };
        let deleteURL = `localhost:60001/cart`;
        axios.delete(deleteURL, {header, data}
        ).then(function (response) {
            console.log(response)
        })
            .catch(function (error) {
                console.log(error)

            })
    }

    increaseQuantity() {
        this.setState({quantity: this.state.quantity + 1})
    }

    decreaseQuantity() {
        this.setState({quantity: this.state.quantity - 1})
    }

    render() {

        return (


            <div className="card">
                <img className="card-img-top" src={this.props.imgURL} width={411} height={236}/>
                <Button className="minus" variant={"primary"} onClick={this.decreaseQuantity.bind(this)}> - </Button>
                <div className="card-body">
                    <p className="card-text">{this.props.price} $</p>
                    <p className="card-text"> {this.state.quantity}</p>
                </div>
                <p className="card-text">{this.props.name}</p>
                <Button variant={"danger"} className="delete"
                        onClick={this.handleDeleteClick.bind(this)}> Remove</Button>
                <Button variant={"primary"} className="plus" onClick={this.increaseQuantity.bind(this)}> + </Button>
            </div>
        )
    }
}

export default shoppingCartItem;