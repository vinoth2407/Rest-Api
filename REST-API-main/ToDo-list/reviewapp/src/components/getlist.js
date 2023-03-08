import { useState, useEffect } from "react";
import axios from "axios";

const Dis = () => {
    const [myData, setMyData] = useState([]);
    const [isError, setIsError] = useState("");
    useEffect(() => {
        axios.get("http://localhost:8080/list")
            .then((response) => {
                console.log(response.data)
                setMyData(response.data)
            })
            .catch((error) => setIsError(error.message));
    }, []);

    return (
        <>
            <h1 className="head">Events</h1>
            {isError !== "" && <h2>{isError}</h2>}
              
            <div className="table table-bordered">
                <table className="table caption-top">
                    <tr>
                        <th>ID</th>
                        <th>EVENT NAME</th>
                        <th>START TIME</th>
                        <th>END TIME</th>
                    </tr>
                {myData.map((post) => {
                    return (
                        
                               
                                <tr key={(post.eventId)}>

                                    <td>{post.eventId}</td>
                                    <td>{post.eventName}</td>
                                    <td>{post.startTime}</td>
                                    <td>{post.endTime}</td>
                                    
                                    
                                </tr>
                        
                        );
                    })}
                    </table>
            </div>
           
        </>
    );
};

export default Dis;