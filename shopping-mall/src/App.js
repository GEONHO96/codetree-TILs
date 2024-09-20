import './App.css';
import Header from './components/Header';
import Product from './components/Product';
import Products from './components/Products';
import { Routes, Route } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.min.css';
import Headers from './components/Headers';
import CartDetails from './components/CartDetails';

function App() {
  return (
    <>
      <Headers />
      <Routes>
        <Route exact path="/" element={<Products />} />
        <Route exact path="/products/:id" element={<Product />} />
        <Route exact path="/cart" element={<CartDetails />} />
      </Routes>
    </>
  );
}

export default App;
