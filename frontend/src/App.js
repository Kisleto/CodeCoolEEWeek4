import React, {Component} from 'react';
import './App.css';
import Item from "./components/item"
import axios from 'axios';
import Grid from 'material-grid/dist/Grid/Grid';
import {BrowserRouter} from "react-router-dom";


class App extends Component {
    state = {
        items: [],
        name: "",
        price: 0,
        imgURL: "",
    };


    componentDidMount() {
        let shitWishAPIUrl = `http://localhost:8091/products`;
        axios.get(shitWishAPIUrl)
            .then(res => {
                const items = res.data;
                this.setState({items});

            })
    };


    render() {

        return (
                <BrowserRouter>
                    <div>
                        <Grid>
                            {this.state.items.map((item) => <Item name={item.name} price={item.price}
                                                                  imgURL={item.imgURL}/>)}
                        </Grid>
                    </div>
                </BrowserRouter>);
        }
  }


export default App;
