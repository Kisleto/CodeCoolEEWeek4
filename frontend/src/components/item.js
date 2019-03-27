import React, {Component} from 'react';
import "./css/item.css"
import axios from 'axios';


class Item extends Component {

    constructor(props) {
        super(props);
        this.handleClick = this.handleClick.bind(this);
        this.state = {
            name: "",
            price: 0,
            imgURL: "",

        }
    }

    handleClick() {
        let shoppingCartURL = `http://localhost:60001/add`;
        axios.post(shoppingCartURL, {
            name: this.props.name,
            price: this.props.price,
            imgURL: this.props.imgURL
        })
            .then(function (response) {
                console.log(response)
            })
            .catch(function (error) {
                console.log(error)

            })

    }


    render() {

            return (
            <div>
                <div className="containers">
                    <div className="row">
                        <div className="block span3">
                            <div className="product">
                                <img src="https://via.placeholder.com/100"/>
                                    <div className="buttons">
                                        <a className="buy btn btn-large btn-info" href="#">
                                            Add to Cart</a>
                                    </div>
                            </div>
                            <div className="info">
                                <h4>{this.props.name}</h4>
                                <span className="description"></span>
                                <span className="price">{this.props.price}</span>
                                <a className="btn btn-info pull-right" href="#" onClick={this.handleClick}>Buy Now</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            )

    }

}
export default Item