import React, { useEffect, useState } from "react";
import ReferendumList from "../components/ReferendumList";
import { fetchReferendums } from "../services/api";

function ReferendumPage() {
  const [referendums, setReferendums] = useState([]);

  useEffect(() => {
    fetchReferendums().then(data => setReferendums(data));
  }, []);

  return (
    <div>
      <h1>Current Referendums</h1>
      <ReferendumList referendums={referendums} />
    </div>
  );
}

export default ReferendumPage;
