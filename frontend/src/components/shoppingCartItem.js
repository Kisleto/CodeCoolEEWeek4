import {Button} from "react-bootstrap";
import React, {Component} from "react";
import "./css/shoppingcart.css"

class shoppingCartItem extends Component {
    state = {
        quantity: 1
    };


    componentDidMount() {
        this.setState({quantity: this.props.quantity})
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
                <Button variant={"primary"} className="plus" onClick={this.increaseQuantity.bind(this)}> + </Button>
            </div>
        )
    }
}

export default shoppingCartItem;