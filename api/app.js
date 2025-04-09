import express from "express";
const app = express();

app.use("/app/first", (res, req) => {
  req.send("Server running on browser...");
})

app.listen(8800, ()=> {
  console.log("Server running on widow browser from online microsoft window");
})