import React, {Component} from 'react';
import './App.css';
import Header from "./components/header";
import Item from "./components/item"
import axios from 'axios';
import Grid from 'material-grid/dist/Grid/Grid';
import Cell from 'material-grid/dist/Grid/Cell';


class App extends Component {
    state = {
      items : []
    };


    componentDidMount() {
        let shitWishAPIUrl = `http://localhost:8091/products/all`;
        axios.get(shitWishAPIUrl)
            .then(res => {
                const items = res.data;
                this.setState({items});

            })
    };


    render() {
    return (
     <div>
         <Header/>
         <Grid>
             {this.state.items.map((item)=><Item name={item.name} price={item.price}/>)}
         </Grid>

     </div>
    );
  }
}

export default App;
