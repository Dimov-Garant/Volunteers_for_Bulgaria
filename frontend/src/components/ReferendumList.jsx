import React from "react";

function ReferendumList({ referendums }) {
  return (
    <ul>
      {referendums.map((referendum) => (
        <li key={referendum.id}>
          <h3>{referendum.title}</h3>
          <p>{referendum.description}</p>
        </li>
      ))}
    </ul>
  );
}

export default ReferendumList;
