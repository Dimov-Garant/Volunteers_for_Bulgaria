import React from "react";
import { Link } from "react-router-dom";
import styles from "./Navbar.module.css";

function Navbar() {
  return (
    <nav className={styles.nav}>
      <ul className={styles.ul}>
        <li>
          <Link to="/" className={styles.a}>
            Доброволци за България
          </Link>
        </li>
        <li>
          <Link to="/login" className={styles.a}>
            Вход
          </Link>
        </li>
        <li>
          <Link to="/referendums" className={styles.a}>
            Гласувания
          </Link>
        </li>
      </ul>
    </nav>
  );
}

export default Navbar;
