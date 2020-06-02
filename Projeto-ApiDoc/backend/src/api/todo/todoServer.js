const Todo = require('./todo');

/**
 * @api {get} /tasks List all tasks
 * @apiGroup Tasks
 * @apiSuccess {Object[]} tasks Task's list
 * @apiSuccess {Number} tasks.id Task id
 * @apiSuccess {String} tasks.title Task title
 * @apiSuccess {Boolean} tasks.done Task is done?
 * @apiSuccess {Date} tasks.updated_at Update's date
 * @apiSuccess {Date} tasks.created_at Register's date
 * @apiSuccessExample {json} Success
 *     HTTP/1.1 200 OK
 *     [{
 *      "id": 1,
 *      "title": "Study",
 *      "done": false,
 *      "updated_at": "2016-02-10T15:46:51.778Z",
 *      "createt_at": "2016-02-10T15:46:51.778Z"
 *      }]
 * @apiErrorExample {json} List error
 *     HTTP/1.1 500 Internal Server Error
 */

 /**
 * @api {post} /tasks Create a new tasks
 * @apiGroup Tasks
 * @apiParam {String} tasks.title Task title
 * 
 * @apiSuccess {Number} tasks.id New task id
 * @apiSuccess {Boolean} tasks.done Task is done?
 * @apiSuccess {Date} tasks.created_at Register's date
 * @apiSuccessExample {json} Success
 *     HTTP/1.1 200 OK
 *     [{
 *      "id": 2,
 *      "title": "New study",
 *      "done": false,
 *      "createt_at": "2016-02-10T15:46:51.778Z"
 *      }]
 * @apiErrorExample {json} Error
 *     HTTP/1.1 400 Create New Task Error
 */

  /**
 * @api {put} /tasks/:id Change a tasks
 * @apiGroup Tasks
 * @apiParam {String} tasks.title Task title
 * 
 * @apiSuccess {Boolean} tasks.done Task is done?
 * @apiSuccessExample {json} Success
 *     HTTP/1.1 200 OK
 *     [{
 *      "title": "Study",
 *      "done": true
 *      }]
 * @apiErrorExample {json} Error
 *     HTTP/1.1 500 Internal Server Error
 */

 /**
 * @api {delete} /tasks/:id Delete tasks
 * @apiGroup Tasks
 * @apiParam {Number} id <code>id</code> of the task.
 *
 * @apiSuccess {String} result <code>ok</code> if everything went fine.
 * @apiSuccessExample {json} Success
 *     HTTP/1.1 200 OK
 *     {
 *         "result": "ok"
 *     }
 *
 * @apiError UserNotFound   The <code>id</code> of the Task was not found.
 * @apiError (500 Internal Server Error) InternalServerError The server encountered an internal error.
 *
 * @apiErrorExample {json} Error
 *     HTTP/1.1 401 Not Authenticated
 */

Todo.methods(['get', 'post', 'put', 'delete']);
Todo.updateOptions({runValidators: true});

module.exports = Todo;