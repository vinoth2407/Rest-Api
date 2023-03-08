import { Outlet, Link } from "react-router-dom";
import "./styleLayout.css";
const Layout = () => {
  return (
    <>
      <nav>
        <ul>
          <li>
            <Link to="/layout/post">Post</Link>
          </li>
          <li>
            <Link to="/layout/get">List Events</Link>
          </li>
          <li>
            <Link to="/layout/delete">Delete Event</Link>
          </li>
          <li>
            <Link to="/layout/update">Update Event</Link>
          </li>
        </ul>
      </nav>

      <Outlet />
    </>
  );
};

export default Layout;