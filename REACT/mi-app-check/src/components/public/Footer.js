import React, { useState } from "react";

export const Footer = () => {
  const [click, setClick] = useState(0);

  const sumarClicks = () => {
    setClick(click + 1);
  };
  const restarClicks = () => {
    setClick(click - 1);
  };

  const year = new Date().getFullYear();
  const nombre = "ROBOTECH";

  return (
    <div className="container">
      <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
        <p class="col-md-4 mb-0 text-body-secondary">
          &copy; {year} {nombre} → {click}
        </p>

        <a
          href="/"
          class="col-md-4 d-flex align-items-center justify-content-center mb-3 mb-md-0 me-md-auto link-body-emphasis text-decoration-none"
        >
          <svg
            id="footerLogoMark"
            xmlns="http://www.w3.org/2000/svg"
            width="100"
            height="100"
            viewBox="0 0 255 255"
          >
            <path d="M153.5 176.6c-19.8 11.2-24.9 39.7-25.8 46.9 25.6-.1 49.6-10 67.7-28.1 5.9-5.9 11-12.5 15.1-19.5-5.9-1.7-18.5-4.8-31.6-4.8-8.8-.1-17.9 1.3-25.4 5.5zm-48.5-6.3c8.4 4.8 14.5 12 18.8 19.7V67.1c-3 8.5-6.7 18-11.1 27.9-8.5 19.4-17.9 36.2-27.7 50-5.1 7.1-10.3 13.4-15.6 18.9 2.2-.2 4.4-.2 6.7-.2 11.5 0 21.2 2.3 28.9 6.6zm-73.5-42.8c0 17 4.4 33.3 12.6 47.7 54-32.3 81.1-135.3 83.2-143.7-25.6 0-49.7 10-67.8 28.1-18 18.1-28 42.3-28 67.9zm70 49.1C94 172.4 85 171 76.1 171c-13.1 0-25.7 3.1-31.6 4.8 4.1 7 9.2 13.6 15.1 19.5 18.1 18.1 42.1 28.1 67.7 28.1-1-7-6-35.5-25.8-46.8zM127.5 0C57.1 0 0 57.1 0 127.5S57.1 255 127.5 255 255 197.9 255 127.5 197.9 0 127.5 0zm73 200.5c-19.5 19.5-45.4 30.2-73 30.2S74 220 54.5 200.5s-30.2-45.4-30.2-73S35 74 54.5 54.5s45.4-30.3 73-30.3 53.5 10.7 73 30.2 30.2 45.4 30.2 73c.1 27.7-10.7 53.6-30.2 73.1zm-21.6-36.8c2.3 0 4.5.1 6.7.2-5.4-5.5-10.6-11.8-15.6-18.9-9.9-13.8-19.2-30.6-27.7-50-4.4-9.9-8.1-19.5-11.1-27.9V190c4.4-7.7 10.4-14.9 18.8-19.7 7.7-4.3 17.4-6.6 28.9-6.6zm16.5-104.1c-18.1-18.1-42.2-28.1-67.8-28.1 2.1 8.3 29.3 111.3 83.2 143.7 8.2-14.4 12.6-30.7 12.6-47.7.1-25.6-9.9-49.8-28-67.9z"></path>
          </svg>
        </a>

        <button
          className="btn btn-sm btn-outline-success me-auto"
          onClick={sumarClicks}
        >
          Sumar clicks
        </button>

        <button
          className="btn btn-sm btn-outline-danger me-auto"
          onClick={restarClicks}
        >
          Restar clicks
        </button>
      </footer>
    </div>
  );
};
