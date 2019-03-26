import React, {Component} from 'react';
import axios from 'axios';
import "./css/item.css"


class Item extends Component {

    constructor(props) {
        super(props);
        this.state = {
            name: "",
            price: 0,
        }
    }



    render() {

            return (
            <div>
                <div className="containers">
                    <div className="row">
                        <div className="block span3">
                            <div className="product">
                                <img src={"http://placehold.it/295x190/333333/FFFFFF"}/>
                                    <div className="buttons">
                                        <a className="buy btn btn-large btn-info" href="#">
                                            <i className="icon-shopping-cart">Shopping Cart</i> Add to Cart</a>
                                        <a className="preview btn btn-large btn-info" href="#">
                                        View item</a>
                                    </div>
                            </div>
                            <div className="info">
                                <h4>{this.props.name}</h4>
                                <span className="description">

        </span>
                                <span className="price">{this.props.price}</span>
                                <a className="btn btn-info pull-right" href="#">Buy Now</a>
                            </div>

            </div>
                    </div>
                </div>
            </div>
            )

    }

}
export default Item