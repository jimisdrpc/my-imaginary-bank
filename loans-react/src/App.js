import React, { useEffect, useState } from "react";
import axios from "axios";

export default function RestApiHooksComponent() {
  const [data, setData] = useState([]);

  useEffect(() => {
    axios
      .get("http://127.0.0.1:8080")
      .then(result => {
        const items = result.data // It should be an array to map
        console.log(items)
        if (items && items.length) {
           setData(items)
        }
     });
      //.then(result => setData(result.data));
  }, []);

  return (
    <div>
      <ul>
        {data.map(item => (
          <li key={item.result}>
            {item.result}: {item.result}
          </li>
        ))}
      </ul>
    </div>
  );
}