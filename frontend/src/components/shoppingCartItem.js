import {Button} from "react-bootstrap";
import React, {Component} from "react";
import "./css/shoppingcart.css"
import axios from 'axios';


class shoppingCartItem extends Component {
    state = {
        quantity: 1,
        img: "",
        price: 0,
        name: ""
    };


    componentDidMount() {
        this.setState({quantity: this.props.quantity});
        this.setState({img: this.props.imgURL});
        this.setState({name: this.props.name});
        this.setState({price: this.props.price})
    }

    handleDeleteClick() {
        const data = {'data': this.props.id};
        let deleteURL = `http://localhost:60001/cart`;
        axios.delete(deleteURL, {data}
        ).then(function (response) {
            console.log(response)
        })
            .catch(function (error) {
                console.log(error)

            });
        this.setState({quantity: ""});
        this.setState({img: ""});
        this.setState({name: ""});
        this.setState({price: ""})
    }


    increaseQuantity() {
        this.setState({quantity: this.state.quantity + 1})
    }

    decreaseQuantity() {
        this.setState({quantity: this.state.quantity - 1})
    }

    render() {
        if (this.state.name === "") {
            return (
                <div></div>
            )
        } else {

            return (

                <div className="card">
                    <img className="card-img-top" src={this.state.img} width={411} height={236}/>
                    <Button className="minus" variant={"primary"}
                            onClick={this.decreaseQuantity.bind(this)}> - </Button>
                    <div className="card-body">
                        <p className="card-text">{this.state.price} $</p>
                        <p className="card-text"> {this.state.quantity}</p>
                    </div>
                    <p className="card-text">{this.state.name}</p>
                    <Button variant={"danger"} className="delete"
                            onClick={this.handleDeleteClick.bind(this)}> Remove</Button>
                    <Button variant={"primary"} className="plus" onClick={this.increaseQuantity.bind(this)}> + </Button>

                </div>
            )
        }
    }
}

export default shoppingCartItem;