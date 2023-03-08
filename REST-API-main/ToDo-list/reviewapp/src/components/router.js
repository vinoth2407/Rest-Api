import ReactDOM from "react-dom/client";
import { BrowserRouter , Routes, Route } from "react-router-dom";
import Layout from "./app";
import Delete from "./deleteController";
import Dis from "./getlist";
import Display from "./review";
import Update from "./Update";


export default function Disp() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Display/>} />
        <Route path="/layout" element={<Layout/>}>
          
          <Route path="/layout/post" element={<Display/>} />
          <Route path="/layout/get" element={<Dis/>} />
          <Route path="/layout/delete" element={<Delete/>} />
          <Route path="/layout/update" element={<Update/>} />
         
         
        </Route>
      </Routes>
    </BrowserRouter>
  );
}
