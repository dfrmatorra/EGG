import React from "react";

const Footer = () => {
    return (
      <div>
        <nav>
          <span id="hudMark" className="show">
            <form id="footerLogin" method="post" action="https://robotech.com/">
              <div className="hiddenFields">
                <input type="hidden" name="ACT" value="10" />
                <input type="hidden" name="RET" value="-2" />
                <input type="hidden" name="site_id" value="1" />
                <input type="hidden" name="csrf_token" value="9dc7e3d977f05b1c220562ccaf500140a89c059b" />
              </div>
  
              <div className="linkGroup">
                <a href="/user/enlist" className="footerLink">enlist</a>
                <a href="/user/forgot-password" className="footerLink">forgot my password</a>
              </div>
              <div className="input pointLeft">
                <span></span>
                <input type="email" name="username" id="username" placeholder="EMAIL" />
                <span></span>
              </div>
              <div className="input">
                <span></span>
                <input type="password" name="password" id="password" placeholder="PASSWORD" />
                <span></span>
              </div>
              <button className="input footerButton"><span></span>login<span></span></button>
            </form>
            <div id="footerMarkAn">
              <svg className="outer" xmlns="http://www.w3.org/2000/svg" width="42" height="42" viewBox="0 0 42 42">
                {/* Path data */}
              </svg>
              <svg className="inner" xmlns="http://www.w3.org/2000/svg" width="42" height="42" viewBox="0 0 42 42">
                {/* Path data */}
              </svg>
            </div>
            <svg id="footerLogoMark" xmlns="http://www.w3.org/2000/svg" width="255" height="255" viewBox="0 0 255 255">
              {/* Path data */}
            </svg>
          </span>
          <div id="hud">
            <svg id="hudBG" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1238 758" preserveAspectRatio="xMidYMid meet" width="100%" height="100%">
              {/* Path data */}
            </svg>
            <svg id="hudBG_m" xmlns="http://www.w3.org/2000/svg" width="100%" height="100%" viewBox="0 0 760 1013" preserveAspectRatio="xMidYMid meet">
              {/* Path data */}
            </svg>
            <div id="hudContent" style={{ width: '291px', marginLeft: '-145.5px' }}>
              <div id="content" className="newUser">
                {/* Content elements */}
              </div>
            </div>
            <span className="lineH" id="lineLeft"></span>
            <span className="lineH" id="lineRight"></span>
          </div>
        </nav>
      </div>
    );
  };
  
  export default Footer;