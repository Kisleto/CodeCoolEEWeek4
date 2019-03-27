import React, {Component} from 'react';
import "./css/item.css"

class Item extends Component {

    constructor(props) {
        super(props);
        this.state = {}
    }



    render() {

            return (
            <div>
                <div className="containers">
                    <div className="row">
                        <div className="block span3">
                            <div className="product">
                                <img src={this.props.imgURL}/>
                                    <div className="buttons">
                                        <a className="buy btn btn-large btn-info" href="#">
                                            Add to Cart</a>
                                        <a className="preview btn btn-large btn-info" href="#">
                                        View item</a>
                                    </div>
                            </div>
                            <div className="info">
                                <h4>{this.props.name}</h4>
                                <span className="description"></span>
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