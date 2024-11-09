require("dotenv").config();
const express = require("express");

const app = express();
const mongoose = require("mongoose");

const PORT = process.env.PORT || 3002;
const uri = process.env.MONGO_URL || 3002;
app.listen(PORT, () => {
  mongoose.connect(uri);
  console.log("app started");
});
