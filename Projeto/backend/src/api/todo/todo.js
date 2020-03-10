const restful = require('node-restful');
const mongoose = restful.mongoose;

const todoSchema = new mongoose.Schema({
    descricao: {type: String, require: true},
    finalizado: { type: Boolean, require: true, default: false},
    criadoEm: {type: Date, default: Date.now}
});

module.exports = restful.model('Todo', todoSchema);