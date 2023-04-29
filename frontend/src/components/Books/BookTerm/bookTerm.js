import React from 'react';
import {Link} from 'react-router-dom';

const bookTerm = (props) => {
    return (
        <tr>
            <td>{props.term.name}</td>
            <td>{props.term.category.name}</td>
            <td>{props.term.author.name} {props.term.author.surname}</td>
            <td>{props.term.availableCopies}</td>
            <td className={"text-right"}>
                <a title={"Delete"} className={"btn btn-danger me-2"}
                   onClick={() => props.onDelete(props.term.id)}>
                    Delete
                </a>
                <Link className={"btn btn-info ml-2 me-2"}
                      onClick={() => props.onEdit(props.term.id)}
                      to={`/books/edit/${props.term.id}`}>
                    Edit
                </Link>
                <a title={"Mark As Taken"} className={"btn btn-secondary btn-success btn-md active me-2"} aria-pressed="true"
                   onClick={() => props.onMarkAsTaken(props.term.id)}>
                    Mark As Taken
                </a>
            </td>
        </tr>
    )
}

export default bookTerm;
