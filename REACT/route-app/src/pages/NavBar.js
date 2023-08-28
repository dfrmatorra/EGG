import React from "react";
import Logo from "../logo192.png";

const menu = "Menu diario";
const precio = "Precios";

const NavBar = () => {
  return (
    <div>
      <header className="p-3 bg-dark text-white">
        <nav className="navbar navbar-expand-lg bg-body-tertiary">
          <div className="container-fluid">
            <a className="navbar-brand" href="#">
              Navbar
            </a>
            <button
              className="navbar-toggler"
              type="button"
              data-bs-toggle="collapse"
              data-bs-target="#navbarNav"
              aria-controls="navbarNav"
              aria-expanded="false"
              aria-label="Toggle navigation"
            >
              <span className="navbar-toggler-icon"></span>
            </button>
            <div className="collapse navbar-collapse" id="navbarNav">
              <ul className="navbar-nav">
                <li className="nav-item">
                  <a className="nav-link active" aria-current="page" href="#">
                    Home
                  </a>
                </li>
                <li className="nav-item">
                  <a className="nav-link" href="#">
                    {menu}
                  </a>
                </li>
                <li className="nav-item">
                  <a className="nav-link" href="#">
                    {precio}
                  </a>
                </li>
                <li className="nav-item">
                  <a className="nav-link disabled" aria-disabled="true">
                    
                  </a>
                </li>
              </ul>
            </div>
          </div>
        </nav>
        <span className='logo'>
      <img 
      className='app-logo'
      height={52}
      src= {Logo}
      alt='no carga el logo'
       />
      </span>
      </header>
    </div>
  );
};

export default NavBar;
