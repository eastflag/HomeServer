import {Member} from "./member";
/**
 * Created by eastflag on 2017-01-09.
 */

export class Board {
    board_id: number;
    title: string;
    content: string;
    level: number;
    parent_id: number;
    created: string;
    member: Member;
}
